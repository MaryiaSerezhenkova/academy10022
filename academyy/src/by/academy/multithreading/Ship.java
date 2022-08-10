package by.academy.multithreading;
//Написать клиент для работы порта. Корабли могут заходить в порт для разгрузки / загрузки контейнеров.

//Количество контейнеров, находятся в текущий момент в порту и на корабле, должно быть неотъемлемой и не превышать заданную грузоподъемность судна и емкость порта.
//В порту работает несколько причалов.
//В одном причале может стоять только один корабль. Корабль может загружаться у причала, разгружаться или выполнять оба действия.

public class Ship extends Thread {
	String name;
	int containersToTake;
	int containersToLeave;
	public Port port;

	public Ship(String name, int containersToTake, int containersToLeave, Port port) {
		super();
		this.name = name;
		this.containersToTake = containersToTake;
		this.containersToLeave = containersToLeave;
		this.port = port;
		start();
	}

	@Override
	public void run() {
		boolean isChanged = false;

		try {
			while (true) {
				if (!isChanged) {
					port.getDock();
				}

				isChanged = false;
				if (containersToLeave != 0 && containersToTake != 0) {
					containersToTake--;
					containersToLeave--;
					isChanged = true;
				} else {
					if (containersToLeave != 0) {
						synchronized (port) {
							if (port.getContainersCapacity() > port.getContainersQuantity()) {
								port.addContainer();
								containersToLeave--;
								isChanged = true;
							}
						}
					} else {
						if (containersToTake != 0) {
							synchronized (port) {
								if (port.getContainersQuantity() > 0) {
									port.takeContainer();
									;
									containersToTake--;
									isChanged = true;
								}
							}
						} else {
							System.out.println(Thread.currentThread().getName() + " has finished his task");
							port.leavePort();
							break;
						}
					}
				}

				if (isChanged) {
					Thread.sleep(10);
				} else {
					port.leavePort();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
