package lang;

public class Value {
    int Value;

    public Value(int value) {
        Value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // obj 가 Value 의 instance 여부 확인 후 형변환

        if (obj instanceof Value) {
            Value v = (Value) obj;
            if (this.Value == v.Value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Value [Value=" + Value + "]";
    }

    // String => int : Integer.parseInt("65")
    // int => String
    // @Override
    // public String toString() {
    // return this.Value + "";
    // }

}
