// Einfaches JS für Demo
document.getElementById('addTaskForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const title = document.getElementById('title').value;
    const description = document.getElementById('description').value;
    alert('Aufgabe hinzugefügt: ' + title);
    // In Realität: AJAX zu Server
});