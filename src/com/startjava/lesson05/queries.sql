-- 1 выведите всю таблицу
SELECT * FROM robots;

-- 2 отобразите только не уничтоженных роботов
SELECT * FROM robots WHERE status != 'destroyed';

-- 3 отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM robots WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- 4 отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM robots ORDER BY mark ASC;

-- 5 отобразите самого старого робота
SELECT * FROM robots WHERE launch = (SELECT MIN(launch) FROM robots);
-- второй способ
SELECT * FROM robots ORDER BY launch LIMIT 1;

-- 6 отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM robots WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM robots);
SELECT * FROM robots WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM robots);

-- 7 отобразите средний вес роботов
SELECT AVG(weight) FROM robots;

-- 8 увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE robots SET kaijuKill = kaijuKill + 1 WHERE status != 'destroyed';

-- 9 удалите уничтоженных роботов
DELETE FROM robots WHERE status = 'destroyed';