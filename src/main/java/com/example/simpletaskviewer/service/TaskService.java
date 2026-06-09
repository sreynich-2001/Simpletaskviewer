package com.example.simpletaskviewer.service;

// Taskクラスを使うためのimport（タスクのデータを表すクラス）
import model.Task;

// Springに「これはServiceクラスだよ」と伝えるアノテーション
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// 「ビジネスロジック（処理）」を担当するクラス
@Service
public class TaskService {

	// タスクを保存するリスト（簡易的なデータベースの代わり）
	private List<Task> tasks = new ArrayList<>();

	// タスクに割り振るID（1からスタート）
	private int nextId = 1;

	// =========================
	// 一覧取得処理
	// =========================

	// 登録されているすべてのタスクを取得するメソッド
	public List<Task> getAllTasks() {
		// tasksリストをそのまま返す
		return tasks;
	}

	// =========================
	// 追加処理
	// =========================

	// 新しいタスクを追加するメソッド
	public void addTask(String title) {

		// 新しいTaskオブジェクトを作成
		// nextIdを使ってIDを設定し、その後++で次のIDに更新
		Task task = new Task(nextId++, title);

		// 作成したタスクをリストに追加
		tasks.add(task);
	}

	// =========================
	// 削除処理
	// =========================

	// 指定されたIDのタスクを削除するメソッド
	public void deleteTask(int id) {

		// removeIf：条件に合う要素を削除するメソッド
		// 「taskのIDが引数idと同じなら削除する」という意味
		tasks.removeIf(task -> task.getId() == id); 
	}
}