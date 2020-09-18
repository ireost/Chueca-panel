class MainFooter extends HTMLElement {
  constructor () {
    super();
  }
  connectedCallback () {
    this.innerHTML = `
      <div>
        <footer id='MainFooter' class=" mt-5 pb-3 text-center bg-light" style="border-top: 3px solid rgb(56,20,116)">
          <div class="row ">
            <div id='redes' class="col-lg-6 col-md-6 col-sm-12 mt-3">
              <h4 style="color: rgb(56,20,116)">Seguinos en nuestras redes:</h4><br>
              <ion-icon name="logo-facebook" size = "large"></ion-icon>
              <ion-icon name="logo-instagram" size = "large"></ion-icon>
              <ion-icon name="logo-pinterest" size = "large"></ion-icon>
            </div>
            <div id='direccion' class="col-lg-6 col-md-6 col-sm-12 mt-3">
              <h4 style="color: rgb(56,20,116)">Donde estamos</h4><br>
              <strong>Direccion:</strong> Neuquen 1565, Las Heras, Mendoza<br>
              <strong>Telefono:</strong> 261-4309797 <br>
            </div>
          </div>
        </footer>
      </div>
  


    `;
  }
}
window.customElements.define('main-footer', MainFooter)