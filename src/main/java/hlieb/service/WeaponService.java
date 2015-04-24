package hlieb.service;

import hlieb.model.weapons.Weapon;

public interface WeaponService {
	public void saveWeapon(Weapon weapon);

	public Weapon getWeapon(Integer id);

	public Iterable<Weapon> getAllWeapons();

	public void deleteWeapon(Integer id);

	Weapon editWeapon(Integer id, Weapon weapon);
}
