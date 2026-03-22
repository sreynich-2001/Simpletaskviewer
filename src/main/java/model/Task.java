package model;

//タスクのデータを表すクラス(Modelクラス)
//1つのタスクの情報を保持する
public class Task {
    
    //タスクのID(タスクを識別するための番号)
    private int id;

    //タスクのタイトル(やることの内容)
    private String title;

    //でふぉうとコンストラクタ
    //フレームワークやライブラリがオブジェクトを生成する際に使用される
    public Task() {}

    //引数付きコンストラクタ
    //タスク作成時にIDとタイトルを同時に設定できる
    public Task(int id, String title) {
        this.id = id;         //引数のidをフィールドに設定
        this.title = title;   //引数のtitleをフィールドに設定
    }

    //idを取得するメソッド(getter)
    public int getId() {
        return id;
    }

    //idを設定するメソッド(setter)
    public void setId(int id) {
        this.id = id;
    }

    //titleを取得するメソッド(getter)
    public String getTitle() {
        return title;
    }

    //titleを設定するメソッド(setter)
    public void setTitle(String title) {
        this.title = title;
    }
}