package ru.bluecat.yandexmapspatcher;

import android.content.res.XModuleResources;
import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import p000.AbstractC0183;
import p000.C0113;
import p000.C0225;
import p000.C2358;
import p000.C2503;
import p000.C2885;
import p000.C4441;
import p000.C4535;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class HookEntry_YukiHookXposedInit implements IXposedHookZygoteInit, IXposedHookLoadPackage {
    public static final int $stable = 0;

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C0225 c0225 = C0225.f846;
        c0225.getClass();
        if (loadPackageParam == null || !C0225.f845) {
            return;
        }
        C0225.m481(c0225, loadPackageParam, 5);
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Object c4535;
        Object c4536;
        C0225 c0225 = C0225.f846;
        c0225.getClass();
        if (startupParam == null) {
            return;
        }
        try {
            String string = new C4441(new long[]{-5260016225721888091L, -6410514261459954869L, 5371580151206379816L, -3629846607619409768L, -5894221555172005785L}).toString();
            String str = startupParam.modulePath;
            boolean z = C0113.f449;
            C0113.f449 = true;
            C0113.f448 = string;
            C0113.f452 = str;
            try {
                int i = C2885.f9623;
                c4536 = new C2885(XModuleResources.createInstance(C0113.f452, (XResources) null));
            } catch (Throwable th) {
                c4536 = new C4535(th);
            }
            if (c4536 instanceof C4535) {
                c4536 = null;
            }
            C2885 c2885 = (C2885) c4536;
            if (c2885 != null) {
                C0113.f451 = c2885;
            }
            C0225.m481(c0225, null, 6);
            C0225.f845 = true;
            c4535 = C2358.f7817;
        } catch (Throwable th2) {
            c4535 = new C4535(th2);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            String string2 = new C4441(new long[]{5276020532735255676L, -1641936245753886119L, -6239506508016075869L, -2562546908410658071L, 7491568358492391234L, 3638678894500728338L, 5334899271244059692L, 1006447331693114620L, -757330862952924732L}).toString();
            ArrayList arrayList = C2503.f8322;
            C2503.m4657(4, string2, thM405);
        }
    }
}
