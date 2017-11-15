import { platformBrowser } from '@angular/platform-browser';
import { ProdConfig } from './blocks/config/prod.config';
import { DeviceMaintenanceAppModuleNgFactory } from '../../../../target/aot/src/main/webapp/app/app.module.ngfactory';

ProdConfig();

platformBrowser().bootstrapModuleFactory(DeviceMaintenanceAppModuleNgFactory)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
