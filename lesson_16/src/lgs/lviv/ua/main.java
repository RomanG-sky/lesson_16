package lgs.lviv.ua;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class main {
	public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException,
			InvocationTargetException, NoSuchFieldException {

		Class camera = Camera.class;

		System.out.println("Ім'я класу: " + camera.getName());

		System.out.println("Просте ім'я класу: " + camera.getSimpleName());

		int modifier = camera.getModifiers();
		String modifierTXT = Modifier.toString(modifier);
		System.out.println("Модифікатор доступу класу: " + modifierTXT + " int = " + modifier);

		System.out.println("Пакет класу: " + camera.getPackage());

		System.out.println("Батьківський клас: " + camera.getSuperclass());

		Class[] interfaces = camera.getInterfaces();
		System.out.println("Використаний інтерфейс" + Arrays.toString(interfaces));

		Constructor<Camera>[] cameraConstructor = camera.getConstructors();
		for (int i = 0; i < cameraConstructor.length; i++) {
			Constructor<Camera> constructor = cameraConstructor[i];
			System.out.println("Конструктор : " + constructor);
		}

		Constructor<Camera> constructor = cameraConstructor[0];
		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println("Конструктор : " + class1);
		}

		System.out.println("Клас " + camera.getSimpleName() + " використовує наступні поля: ");
		Field[] declaredFields = camera.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}

		System.out.println("Кількість полів класу " + camera.getSimpleName() + " = " + declaredFields.length);

		System.out.println("Клас " + camera.getSimpleName() + " включає наступні конструктори: ");
		camera.getConstructors();
		camera.getConstructors();
		Constructor[] cameraConstructor1 = camera.getConstructors();
		for (Constructor constructor2 : cameraConstructor) {
			System.out.println("Конструктор " + constructor2);
		}

		System.out.println("Додаємо екземпляр класу camera");
		Constructor<Camera> newCam = camera.getConstructor(String.class, String.class, double.class);
		Camera newInstance = newCam.newInstance("Zeic", "Quatro", 4.0);
		System.out.println(newInstance);

		System.out.println("Змінюємо значення public поля model ");
		Field modelfield = camera.getField("model");
		modelfield.set(newInstance, "Uno");
		System.out.println(newInstance);

	}
}
