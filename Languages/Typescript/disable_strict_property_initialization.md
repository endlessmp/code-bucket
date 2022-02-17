# Disbale strict property initialization
If you create a new Angular project and a variable inside any ts file without initialising it, the typescript compiler starts to cry. You can easily disable this behaviour if you like!
Add the following flag to the compiler options inside the tsconfig.json file:

```json
"compilerOptions": {
	"strictPropertyInitialization": false
}
```