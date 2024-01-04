const btn = document.querySelector("#button");

btn.addEventListener("click", () => {
  const text = document.querySelector("#text");
  text.textContent = "Hello from JavaScript";
});