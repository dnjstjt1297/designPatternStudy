# Builder 패턴

Builder

- 전체를 구성하는 각 부분을 만들고 단계를 밟아가며 복잡한 구조를 가진 구조물을 만든다.
- 구조를 가진 인스턴스를 만들어가는 패턴을 Builder패턴이라 한다.

패턴의 등장인물

- Builder역: 인스턴스를 생성하기위한 API를 결정한다. Builder역에는 인스턴스의 각 부분을 만드는 메서드가 준비된다.
- ConcreateBuilder역: Builder의 API를 구현하는 클래스다. 실제 인스턴스 생성으로 호출되는 메서드가 정의된다.
- Director역: Builder의 API를 사용하여 인스턴스를 생성한다. ConcreteBuilder역에 의존하는 프로그래밍은 하지 않는다. Builder의 메서드만 사용한다.
- Client역: Bilder패턴을 이용한다.

패턴 사용이유

- Client 클래스는 Builder클래스의 메서드를 모른다.즉 호출하지 않는다. 오직 Director클래스의 constructor메서드만 호출한다.
- Director클래스는 Builder클래스의 하위클래스를 모르기 때문에 교체할 수 있다.
- ConcreteBuilder클래스에 의존하지 않는다. 하지만 Director클래스가 실제로 동작하려면 Builder의 구체적인 인스턴스가 필요하다. 그래서 Director클래스의 생성자를 호출할 때 ConcreteBuilder의 인스턴스의 인수를 통해 전달한다.

  실제로 이 인스턴스를 이용해 동작하는 것을 의존성 주입이라고 한다. 의존성 주입을 통해서 결합도를 낮추고 재사용성을 높여주는 유용한 기법이다.