package app.exception

class UserNotFoundException(id: String) : Exception("user $id was not found")