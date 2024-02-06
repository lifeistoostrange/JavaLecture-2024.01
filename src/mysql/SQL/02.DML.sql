#################################################################
#
# 데이터 조작 언어(Data Maipulation Language)
#
#################################################################

/*
    2. update

        UPDATE 테이블
            SET 필드명1=값1;, 필드명2=값2,...,필드명n=값n
            WHERE 조건;                 # 조건 = 프라이머리 키 = 값
*/
UPDATE kcity SET NAME='용인', population=1100000 WHERE id=2362;
# id가 2391 이상인 값들을 십만씩 더하기
UPDATE kcity SET population=population+100000 WHERE id>2390;

/*
    3.insert

            INSERT INTO테이블(필드명1, 필드명2,..., 필드명n)
                VALUES (값1, 값2,..., 값n) [, (값1, 값2,..., 값n)];

            INSERT INTO 테이블 VALUES (모든 필드의 값ㅇ) [, (모든 필드의 값)];

*/
#경기도 화성시, 의정부시 추가
INSERT INTO kcity
    VALUES (default, '화성', 'KOR', Kyonggi, 9000000),
            (default, '화성', 'KOR', Kyonggi, 2000000);

# 강원도 속초시 추가 - default value 활용(auto_increment 포함)
INSERT INTO kcity(name, countrycode, district) VALUES('속초', 'KOR', 'Kang-won')

# 경기도 광주시 추가 - auto_increment
INSERT INTO kcity VALUES(2600 '광주', 'KOR', 'Kang-won', 300000);

/*
    4. Delete

        DELETE FROM 테이블명 WHERE 조건;        # 조건 - primary key = value
*/
# 강원도 속초시 삭제
DELETE FROM kcity WHERE id=2503;