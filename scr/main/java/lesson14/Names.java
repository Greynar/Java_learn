package lesson14;

import java.util.List;
import java.util.Random;

public class Names {

    public static final List<String> NAMES = List.of("Назар",
            "Наиль",
            "Насиф",
            "Натан",
            "Натаниэль",
            "Наум",
            "Нафанаил",
            "Нацагдорж",
            "Нестор",
            "Никандр",
            "Никанор",
            "Никита",
            "Никифор",
            "Никодим",
            "Николай",
            "Нил",
            "Нильс",
            "Ноа",
            "Ной",
            "Норд",
            "Пабло",
            "Павел",
            "Павлин",
            "Павсикакий",
            "Паисий",
            "Палладий",
            "Панкратий",
            "Пантелеймон",
            "Папа",
            "Паруйр",
            "Парфений",
            "Патрик",
            "Пафнутий",
            "Пахомий",
            "Педро",
            "Перец",
            "Пётр",
            "Пимен",
            "Пинхас",
            "Пипин",
            "Питирим",
            "Платон",
            "Полидор",
            "Полиевкт",
            "Поликарп",
            "Поликрат",
            "Порфирий",
            "Потап",
            "Предраг",
            "Премысл",
            "Пров",
            "Прокл",
            "Прокул",
            "Протасий",
            "Прохор",
            "Публий");
    public static final List<String> SURNAMES = List.of("Смирнов",
            "Иванов",
            "Кузнецов",
            "Соколов",
            "Попов",
            "Петров",
            "Лебедев",
            "Козлов",
            "Новиков",
            "Морозов",
            "Волков",
            "Соловьёв",
            "Васильев",
            "Зайцев",
            "Павлов",
            "Семёнов",
            "Виноградов",
            "Богданов",
            "Воробьёв",
            "Фёдоров",
            "Михайлов",
            "Беляев",
            "Сидоров",
            "Белов",
            "Комаров",
            "Орлов",
            "Киселёв",
            "Макаров",
            "Андреев",
            "Ковалёв",
            "Ильин",
            "Гусев",
            "Титов",
            "Кузьмин",
            "Кудрявцев",
            "Баранов",
            "Куликов",
            "Алексеев",
            "Степанов",
            "Яковлев",
            "Сорокин",
            "Сергеев",
            "Романов",
            "Захаров",
            "Борисов",
            "Королёв",
            "Денисов",
            "Пономарёв",
            "Григорьев",
            "Лазарев",
            "Медведев",
            "Ершов",
            "Никитин",
            "Соболев",
            "Рябов",
            "Поляков",
            "Цветков",
            "Данилов",
            "Жуков",
            "Фролов",
            "Журавлёв",
            "Николаев",
            "Крылов",
            "Максимов",
            "Белоусов",
            "Федотов",
            "Дорофеев",
            "Егоров",
            "Матвеев",
            "Бобров",
            "Дмитриев",
            "Калинин",
            "Анисимов",
            "Петухов",
            "Антонов",
            "Тимофеев",
            "Никифоров",
            "Веселов",
            "Филиппов",
            "Тарасов",
            "Марков",
            "Большаков",
            "Суханов",
            "Миронов",
            "Ширяев",
            "Александров",
            "Коновалов",
            "Шестаков",
            "Казаков",
            "Ефимов",
            "Громов",
            "Герасимов",
            "Фомин",
            "Давыдов",
            "Мельников",
            "Щербаков",
            "Блинов",
            "Колесников",
            "Карпов",
            "Афанасьев",
            "Власов",
            "Маслов",
            "Исаков",
            "Тихонов",
            "Аксёнов",
            "Гаврилов",
            "Родионов",
            "Котов",
            "Горбунов",
            "Кудряшов",
            "Быков",
            "Зуев",
            "Третьяков",
            "Савельев",
            "Панов",
            "Рыбаков",
            "Суворов",
            "Абрамов",
            "Воронов",
            "Мухин",
            "Архипов",
            "Трофимов",
            "Мартынов",
            "Емельянов",
            "Горшков",
            "Чернов",
            "Овчинников",
            "Голубев",
            "Селезнёв",
            "Панфилов",
            "Копылов",
            "Михеев",
            "Галкин",
            "Назаров",
            "Лобанов",
            "Лукин",
            "Беляков",
            "Потапов",
            "Некрасов",
            "Хохлов",
            "Жданов",
            "Наумов",
            "Шилов",
            "Воронцов",
            "Ермаков",
            "Дроздов",
            "Игнатьев",
            "Савин",
            "Логинов",
            "Сафонов",
            "Капустин",
            "Кириллов",
            "Моисеев",
            "Елисеев",
            "Кошелев",
            "Костин",
            "Горбачёв",
            "Орехов",
            "Ефремов",
            "Исаев",
            "Евдокимов",
            "Калашников",
            "Кабанов",
            "Носков",
            "Юдин",
            "Кулагин",
            "Лапин",
            "Прохоров",
            "Нестеров",
            "Харитонов",
            "Агафонов",
            "Муравьёв",
            "Ларионов",
            "Федосеев",
            "Зимин",
            "Пахомов",
            "Шубин",
            "Игнатов",
            "Филатов",
            "Крюков",
            "Рогов",
            "Кулаков",
            "Терентьев",
            "Молчанов",
            "Владимиров",
            "Артемьев",
            "Гурьев",
            "Зиновьев",
            "Гришин",
            "Кононов",
            "Дементьев",
            "Ситников",
            "Симонов",
            "Мишин",
            "Фадеев",
            "Комиссаров",
            "Мамонтов",
            "Носов",
            "Гуляев",
            "Шаров");
    public static final List<String> PATRONYMICS = List.of("Александрович",
            "Алексеевич",
            "Анатольевич",
            "Андреевич",
            "Антонович",
            "Аркадьевич",
            "Арсеньевич",
            "Артемович",
            "Афанасьевич",
            "Богданович",
            "Борисович",
            "Вадимович",
            "Валентинович",
            "Валериевич",
            "Васильевич",
            "Викторович",
            "Витальевич",
            "Владимирович",
            "Всеволодович",
            "Вячеславович",
            "Гаврилович",
            "Геннадиевич",
            "Георгиевич",
            "Глебович",
            "Григорьевич",
            "Давыдович",
            "Данилович",
            "Денисович",
            "Дмитриевич",
            "Евгеньевич",
            "Егорович",
            "Емельянович",
            "Ефимович ");

    public static String randomizeName() {
        return randomize(NAMES);
    }

    public static String randomizeSurname() {
        return randomize(SURNAMES);
    }

    public static String randomizePatronymics() {
        return randomize(PATRONYMICS);
    }

    private static String randomize(List<String> values) {
        return values.get(new Random().nextInt(values.size()));
    }
}
