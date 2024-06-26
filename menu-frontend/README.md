# Food Menu - [FrontEnd] React, Typescript, React Query and Vite

## 💻 Requirements

* You should have [Docker](https://docs.docker.com/engine/install/) installed 
* And [vscode](https://code.visualstudio.com/) if you wanna try [DevContainer](https://code.visualstudio.com/docs/devcontainers/containers) for development

## 🚀 How to install

Clone repo

```bash
git clone <repo_url>
```

Add a new line in /etc/hosts file

```bash
127.0.0.1 host.docker.internal
```
You can use bellow command

```bash
echo "127.0.0.1 host.docker.internal" | sudo tee -a /etc/hosts
```

### Using Docker

To use docker to run and up application use:


```bash
docker compose up -d
```

access http://host.docker.internal:3000

**Requirement**

You should start backend before


### Using DevContainer

To use dev container to development environment:
1. Install Devcontainer [vscode extension]([DevContainer](https://code.visualstudio.com/docs/devcontainers/containers) )
2. Press Ctrl+Shift+P
3. Choose "Dev Containers: Open folder in Container..." and choose the front-end root folder

After eveyrthing is done you can run
```bash
cd menu-project
npm install
```

and then 

```bash
npm run dev
```

access http://host.docker.internal:3000


### Using local envionment (without Docker)

Before to start you must have node installed.


Install dependencies

```bash
cd menu-project
npm install
```

and run the project

```bash
npm run dev
```

## Tech stack
#### Frontend
* React
* Typescript
* React Query
* Vite
* Axios

#### Others
* Docker
* DevContainer
* [API Client Lite](https://marketplace.visualstudio.com/items?itemName=KomaKamaki.vscode-api-client-lite) - VSCode plugin

## Contact

Twitter: [@mcostacurta](https://x.com/costa_curta)

Linkedin: [@mcostacurta](https://www.linkedin.com/in/mcostacurta/)


## 📝 License

MIT