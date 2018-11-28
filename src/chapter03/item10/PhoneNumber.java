package chapter03.item10;

public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    /**
     * 전화번호를 가진 객체를 생성
     * ex) 02-4444-5555
     * @param areaCode 지역번호 ex) 02
     * @param prefix 중간번호 ex) 4444
     * @param lineNum 맨뒷번호 ex) 5555
     */
    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object obj) {

        /**
         * 1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
         * (뒤에서 수행할 로직 연산이 비싼경우 성능 최적화 용도)
         */
        if (obj == this)
            return true;

        /**
         * 2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
         * - getClass()로 비교하지 않는 이유
         *   - 이 클래스를 상속받은 다른 클래스에서도 재사용하기 위함
         *   - obj가 null이면 NullPointerException을 발생시키지 않고, false로 취급한다. (null에 안정적이다.)
         */
        if (!(obj instanceof PhoneNumber))
            return false;

        /**
         * 3. Object 타입의 레퍼런스를 본래의 타입으로 형변환한다.
         */
        PhoneNumber another = (PhoneNumber) obj;

        /**
         * 4. 핵심 필드들이 모두 일치하는지 하나씩 검사한다.
         * 빠른 연산을 위해, 다를 확률이 높은 필드값을 먼저 비교한다.
         */
        return another.lineNum == this.lineNum && another.prefix == this.prefix && another.areaCode == this.areaCode;
    }
}
