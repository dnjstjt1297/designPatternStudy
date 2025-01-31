# Factory Method 패턴

Factory Method

- 팩토리 메서드 패턴은 인스턴스 생성방법을 상위 클래스에서 결정하정
- 구체적인 클래스 이름은 결정하지 않음

패턴의 등장인물

- Product: 프레임워크 쪽으로 이 패턴에서 생성되는 인스턴스가 가져야할 인터페이스를 결정하는 추상클라스다. 하위 클래스 ConcreteProduct에서 결정한다.
- Creator: 프레임워크 쪽으로 Product역을 생성하는 추상 클래스이다. 구체적인 내용을 하위클래스 ConcreteCreator가 결정한다.
- ConcreteProduct: 구체적인 살을 붙이는 쪽으로 구체적인 제품을 결정한다.
- ConcreteCreator: 구체적인 살을 붙이는 쪽으로 구체적인 제품을 만들 클래스를 결정한다.

패턴 사용 이유

- 프레임워크 패키지 내용을 수정하지 않고 전혀 다른 제품과 공장을 만들 수 있다

이것은 프레임워크 패키지는 concreteProduct에 의존하지 않는다.