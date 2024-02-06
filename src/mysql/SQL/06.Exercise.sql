# 1. 2009년도에 데뷔한 걸그룹의 히트송은
# (걸그룹 이름, 데뷔일자, 히트송 제목)

SELECT * FROM girl_group WHERE YEAR(debut) = 2009;

# 2. 데뷔일자가 빠른 5개 그룹의 히트송은?
# (걸그룹 이름, 데뷔일자, 히트송 제목)

SELECT * FROM girl_group ORDER BY debut ASC LIMIT 5;

# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?

SELECT Continent,
       COUNT(*) AS NumberOfCountries,
       SUM(GNP) AS TotalGNP,
       SUM(GNP) / COUNT(*) AS AverageGNPPerCountry
FROM country
GROUP BY Continent;

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
#       (대륙명, 국가명, 도시명, 인구수)

SELECT country.Continent,
       country.name AS Country,
       city.name AS City,
       city.Population
FROM city
JOIN country ON city.CountryCode = country.Code
WHERE country.Continent = 'Asia'
ORDER BY city.Population DESC
LIMIT 10;


# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
#       (국가명, GNP, 언어명)

SELECT country.name AS Country,
       country.GNP,
       countrylanguage.Language
FROM country
JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.IsOfficial = 'T'
ORDER BY country.GNP DESC
LIMIT 10;
