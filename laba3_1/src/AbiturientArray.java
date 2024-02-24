/**
 * Создает массив объектов - Абитуриентов
 */
public class AbiturientArray {
    public static Abiturient[] abiturients (){
        Abiturient[] abiturients = new Abiturient[17];
        abiturients[0] = new Abiturient(1, "Иванов", "Иван", "Иванович", "ул. Пушкина д.10", "+7(999)123-45-67", new int[]{5, 4, 3});
        abiturients[1] = new Abiturient(2, "Петров", "Петр", "Петрович", "ул. Ленина д.5", "+7(999)765-43-21", new int[]{3, 3, 3});
        abiturients[2] = new Abiturient(3, "Сидорова", "Мария", "Александровна", "ул. Гагарина д.15", "+7(999)246-80-12", new int[]{2, 5, 3});
        abiturients[3] = new Abiturient(4, "Козлов", "Андрей", "Николаевич", "ул. Жукова д.3", "+7(999)555-55-55", new int[]{2, 2, 2});
        abiturients[4] = new Abiturient(5, "Васильева", "Ольга", "Петровна", "ул. Братьев Карамазовых д.7", "+7(999)111-22-33", new int[]{5, 5, 5});
        abiturients[5] = new Abiturient(6, "Москвитин", "Дмитрий", "Олегович", "ул. Мервинская д. 30", "+7(900)111-42-33", new int[]{4, 4, 4});
        abiturients[6] = new Abiturient(7, "Кабил", "Айман", "ул. Циолковского д. 32", "+7(944)141-42-33", new int[]{3, 4, 3});
        abiturients[7] = new Abiturient(8, "Смирнова", "Елена", "ул. Ленина д. 15", "+7(921)123-45-60", new int[]{5, 5, 5});
        abiturients[8] = new Abiturient(9, "Григорьев", "Игорь", "ул. Пушкина д. 10", "+7(905)567-89-00", new int[]{4, 4, 4});
        abiturients[9] = new Abiturient(10, "Петров", "Александр", "ул. Маяковского д. 27", "+7(912)345-67-89", new int[]{4, 3, 5});
        abiturients[10] = new Abiturient(11, "Иванова", "Ольга", "Петровна","ул. Гагарина д. 8", "+7(933)222-11-44", new int[]{5, 4, 4});
        abiturients[11] = new Abiturient(12, "Соколов", "Дмитрий", "ул. Чехова д. 5", "+7(977)999-88-77", new int[]{3, 3, 3});
        abiturients[12] = new Abiturient(13, "Козлова", "Мария", "Петровна","ул. Сталина д. 63", "+7(911)777-66-55", new int[]{3, 4, 3});
        abiturients[13] = new Abiturient(14, "Новиков", "Сергей", "ул. Пушкина д. 12", "+7(922)333-44-50", new int[]{5, 5, 4});
        abiturients[14] = new Abiturient(15, "Михайлов", "Иван", "ул. Ленинградская д. 18", "+7(943)321-54-77", new int[]{4, 4, 5});
        abiturients[15] = new Abiturient(16, "Кузнецова", "Анна", "Петровна","ул. Кирова д. 2", "+7(916)987-65-43", new int[]{5, 3, 4});
        abiturients[16] = new Abiturient(17, "Павлов", "Артем", "ул. Северная д. 7", "+7(950)111-22-33", new int[]{3, 3, 3});
        return abiturients;
    }
}
