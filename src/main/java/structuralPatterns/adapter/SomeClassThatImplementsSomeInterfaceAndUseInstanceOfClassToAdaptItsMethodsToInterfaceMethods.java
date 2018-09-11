package structuralPatterns.adapter;

public class SomeClassThatImplementsSomeInterfaceAndUseInstanceOfClassToAdaptItsMethodsToInterfaceMethods implements SomeInterfaceWeNeedToBeImplemented {
    private SomeClassThatNeedToBeInjectedToInterfaceThatWasNotImplementedByItself someClassThatNeedToBeInjectedToInterfaceThatWasNotImplementedByItself;

    public SomeClassThatImplementsSomeInterfaceAndUseInstanceOfClassToAdaptItsMethodsToInterfaceMethods(){
        someClassThatNeedToBeInjectedToInterfaceThatWasNotImplementedByItself = new SomeClassThatNeedToBeInjectedToInterfaceThatWasNotImplementedByItself();
    }
    public void doSmth() {
        someClassThatNeedToBeInjectedToInterfaceThatWasNotImplementedByItself.doSmth();
    }
}
