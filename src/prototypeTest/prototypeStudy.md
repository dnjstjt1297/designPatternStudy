Prototype

- 어떤 클래스의 인스턴스를 만들고자 할 때 우리는 new를 사용하고 반드시 클래스 이름을 지정해주어야한다. 하지만 클래스 이름을 지정하지 않고 인스턴스를 생성하고 싶을 때도 있다.
1. 종류가 많아 클래스로 정리할 수 없는 경우
    - 취급할 오브젝트 종류가 많아서 하나하나 다른 클래스로 만들면 소스파일을 많이 작성해야할 경우가 생긴다.
2. 클래스로부터 인스턴스 생성이 어려운 경우
    - 인스턴스가 복잡한 과정을 거쳐 만들어지면 클래스로부터 인스턴스를 만들기가 힘들다. 마우스로 도형을 나타내는 인스턴스는 사용자 조작으로 만들기 때문에 클래스로 만들기 힘들다.
3.  프레임워크와 생성하는 인스턴스를 분리하고 싶은 경우
    - 인스턴스를 생성하는 프레임워크를 특정 클래스에 의존하지 않게 하고 싶을 경우도 있다. 클래스 이름을 지정해서 인스턴스를 만드는 것이 아니라, 미리 원형이 될 인스턴스를 등록해두고 등록해둔 인스턴스를 복사해 생성한다.
- 프로토타입은 원형의 뜻을 가지고 있다. 원형이 되는 인스턴스를 바탕으로 새로운 인스턴스를 만든다.

패턴의 등장인물

- Prototype(원형)역: 인스턴스를 복사하여 새로운 인스턴스를 만들기 위한 메서드
- CreatePrototype(구체적인 원형)역: 인스턴스를 복사하여 새로운 인스턴스를 만드는 메서드를 구현
- Client(이용자)역: 인스턴스를 복사하는 메서드를 이용해 새로운 인스턴스를 만든다.