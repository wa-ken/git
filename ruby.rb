# Here your code !

# 入力
year = 2015
month = 2
day = 3

# バリデーション
unless 0 < month && month < 13 then
    puts "月が不正な値だけど続行"
end
unless 0 < day && day < 32 then
    puts "日が不正な値だけど続行"
end

# ツェラーの公式
if month < 3 then
    month += 12
    year -= 1
end

c = year.div(100)
first = day
second = (26*(month+1)).div(10)
third = year % 100
fourth = third.div(4)
fifth = (5 * c) + c.div(4)

h = (first + second + third + fourth + fifth) % 7

# 曜日変換
case h
when 0 then
    result = "土曜日"
when 1 then
    result = "日曜日"
when 2 then
    result = "月曜日"
when 3 then
    result = "火曜日"
when 4 then
    result = "水曜日"
when 5 then
    result = "木曜日"
when 6 then
    result = "金曜日"
end
# 出力
puts result
