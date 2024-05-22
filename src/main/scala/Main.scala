import cask.*

object Main extends cask.MainRoutes:
    @cask.get("/")
    def home() = {
      "Hello Pastebin"
    }

    initialize()
        
