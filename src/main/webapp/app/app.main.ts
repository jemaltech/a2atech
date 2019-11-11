import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { ProdConfig } from './blocks/config/prod.config';
import { A2AtechnologyAppModule } from './app.module';

ProdConfig();

if (module['hot']) {
    module['hot'].accept();
}

platformBrowserDynamic().bootstrapModule(A2AtechnologyAppModule)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
