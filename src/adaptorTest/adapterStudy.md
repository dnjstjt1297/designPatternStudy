# Adapter 패턴

Adapter 패턴

- 이미 제공된 코드를 그대로 사용할 수 없을 때 필요한 형태로 변환한 후 이용하려 할 때 차이를 매꾸는 패턴을 바로 Adapter패턴이라고 한다.
- wrapper패턴이라고도 한다.

종류

- 클래스에 의한 Adapter 패턴(상속)
- 인스턴스에 의한 Adapter 패턴(위임)

상속에 의한 adapter

- Main 클래스에서는 printBanner의 인스턴스를 Print인터페이스형 변수에 대입한다.
- Banner 클래스나 showWithParen메서드 showWithAster 메서드는 Main 클래스 코드에서 완전히 숨겨져 있다. 즉 Main 메서드는 PrintBanner클래스가 어떻게 생겼는지 모른다.

위임에 의한 adapter

- Print인터페이스를 클래스라고 가정 하자
- Banner 클래스를 이용해 Print클래스와 같은 메서드를 갖는 클래스를 실현하려는 것이다. 자바에서는 두 개의 클래스를 동시 상속할 수 없기 때문에 PrintBanner클래스를 Print와 Banner양쪽의 하위 클래스로 정의 할 수 없다.

어댑터는 왜 사용할까

- 이미 존재하는 클래스는 충분히 테스트가 되어 버그가 적다. 그리고 이 클래스의 부품들을 재사용 하고 싶을 때 adapter 패턴을 사용한다.
- Adaptor 패턴은 기존에 존재하는 클래스에 한겹 덧씌워 필요한 클래스를 만든다. 위임이나 상속을 하여 덧씌운다.
- 그러면 기존 클래스의 코드를 전혀 수정하지 않고 목적에 맞는 API를 맞출 수 있다.