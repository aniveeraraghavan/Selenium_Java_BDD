package com.HA.volume;

public class Voume {

	public double volumeOfSphere(double r) {

		double sphere;
		return sphere = 4 / 3 * Math.PI * Math.pow(r, 2);

	}

	// VOLUME OF CYCLINDER
	public double volumeOfCyclinder(double ra) {

		double cyclinder;
		int h = 12;
		return cyclinder = Math.PI * Math.pow(ra, 2) * h;

	}

	// volume of cuboid
	public double volumeOfCuboid(double w, double l, double h) {

		double cuboid;
		return cuboid = (w * l * h);
	}
	// volume of cone

	public void volumeOfCone(long r, long h) {

		double cone = (0.333) * Math.PI * Math.pow(r, 2) * h;
		System.out.println("Volume of Cone is :" + cone);

	}

}
