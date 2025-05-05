export default function TaskList({ tasks, onDelete, onToggle }) {
    return (
      <ul>
        {tasks.map((task) => (
          <li key={task.id}>
            {task.title}
            <button onClick={() => onDelete(task.id)}>❌</button>
          </li>
        ))}
      </ul>
    );
  }
  