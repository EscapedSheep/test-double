package mock;

public class MockDoorPanel extends DoorPanel{
    private Boolean functionIsCalled = false;

    @Override
    public void close() {
        functionIsCalled = true;
    }

    Boolean verify() {
        return functionIsCalled;
    }
}
