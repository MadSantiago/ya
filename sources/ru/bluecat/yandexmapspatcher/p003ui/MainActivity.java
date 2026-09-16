package ru.bluecat.yandexmapspatcher.p003ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Map;
import p000.AbstractActivityC2747;
import p000.AbstractC0502;
import p000.AbstractC0912;
import p000.AbstractC1631;
import p000.AbstractC2539;
import p000.AbstractC2765;
import p000.AbstractC2776;
import p000.AbstractC3310;
import p000.AbstractC3933;
import p000.AbstractC4009;
import p000.AbstractC4187;
import p000.AbstractC4225;
import p000.AbstractC4489;
import p000.AbstractC5378;
import p000.AbstractC5781;
import p000.AbstractC5794;
import p000.C0434;
import p000.C0649;
import p000.C0857;
import p000.C1142;
import p000.C1443;
import p000.C1542;
import p000.C2197;
import p000.C2518;
import p000.C2718;
import p000.C3436;
import p000.C3469;
import p000.C3998;
import p000.C4164;
import p000.C4441;
import p000.C4564;
import p000.C5081;
import p000.ExecutorC4540;
import p000.InterfaceC0443;
import p000.InterfaceC3534;
import p000.InterfaceC5130;
import p000.ServiceConnectionC2110;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC2747 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ۥٛ */
    public static MainActivity f411;

    /* JADX INFO: renamed from: ۥۤ */
    public static C3998 f412;

    /* JADX INFO: renamed from: ۦۜ */
    public final InterfaceC5130 f414 = AbstractC3933.m7095(3, new C0434(this, 2));

    /* JADX INFO: renamed from: ۦۣ */
    public final InterfaceC5130 f415 = AbstractC3933.m7095(1, new C0434(this, 0));

    /* JADX INFO: renamed from: ۥ٘ */
    public final InterfaceC5130 f413 = AbstractC3933.m7095(1, new C0434(this, 1));

    /* JADX WARN: Code duplicated, block: B:11:0x007e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0065  */
    @Override // p000.AbstractActivityC2747, p000.AbstractActivityC1500, p000.AbstractActivityC1700, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C1443 c1443;
        SharedPreferences.Editor editor;
        super.onCreate(bundle);
        AbstractC5378.m9058(getWindow(), false);
        f411 = this;
        f412 = (C3998) this.f413.getValue();
        int i = 1;
        AbstractC4187.m7373(this, new C0857(444237094, new C4164(8, this), true));
        C3469.f11514.getClass();
        App app = App.f407;
        C1443 c1444 = AbstractC2776.m5217().f410;
        C1542 c1542 = AbstractC2539.f8451;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((Boolean) c1444.m3068(obj, str)).booleanValue()) {
            String str2 = C3436.f11406;
            App app2 = App.f407;
            App appM3410 = AbstractC1631.m3410();
            if (Build.VERSION.SDK_INT < 33 || AbstractC4225.m7487(appM3410, C3436.f11406) == 0) {
                C3469.m6256();
            } else {
                c1443 = AbstractC2776.m5217().f410;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(Boolean.FALSE, str);
                editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                    } catch (Throwable unused) {
                    }
                }
                C3469.m6258();
            }
        } else {
            c1443 = AbstractC2776.m5217().f410;
            c1443.getClass();
            C2518 c2519 = new C2518(c1443);
            c2519.m4661(Boolean.FALSE, str);
            editor = c2519.f8351;
            if (editor != null) {
                editor.apply();
            }
            if (!C1443.f4940) {
                AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
            }
            C3469.m6258();
        }
        C5081 c5081 = (C5081) this.f414.getValue();
        c5081.getClass();
        App app3 = App.f407;
        InterfaceC0443 interfaceC0443 = null;
        if (AbstractC4489.m7814(AbstractC1631.m3410()) && AbstractC4489.m7772(AbstractC1631.m3410())) {
            InterfaceC3534 interfaceC3534 = AbstractC2776.m5210(c5081).f2700;
            C0649 c0649 = AbstractC0912.f3276;
            AbstractC2765.m5135(AbstractC4009.m7151(interfaceC3534.mo860(ExecutorC4540.f15006).mo860(c5081.f16853)), null, 0, new C2718(c5081, interfaceC0443, 13), 3);
        }
        if (AbstractC0502.f1818) {
            return;
        }
        App app4 = App.f407;
        C1443 c1445 = AbstractC2776.m5217().f409;
        C1542 c1543 = AbstractC2539.f8454;
        Object obj2 = c1543.f5218;
        String str3 = c1543.f5219;
        boolean z2 = C1443.f4940;
        AbstractC4489.m7810(((Boolean) c1445.m3068(obj2, str3)).booleanValue());
        C0649 c06410 = AbstractC0912.f3276;
        AbstractC2765.m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C4564(2, interfaceC0443, i), 3);
    }

    @Override // p000.AbstractActivityC2747, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (AbstractC0502.f1818) {
            return;
        }
        ServiceConnectionC2110 serviceConnectionC2110 = AbstractC5781.f19049;
        ArrayList arrayList = AbstractC3310.f11082;
        synchronized (arrayList) {
            AbstractC3310.f11081.removeIf(new C1142(2));
        }
        ServiceConnectionC2110 serviceConnectionC2111 = AbstractC5781.f19049;
        synchronized (arrayList) {
            AbstractC3310.f11083.removeIf(new C1142(3));
        }
    }

    @Override // p000.AbstractActivityC2747, android.app.Activity
    public final void onPause() {
        super.onPause();
        Map map = AbstractC0502.f1819;
        SharedPreferences sharedPreferences = AbstractC0502.f1815;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // p000.AbstractActivityC2747, p000.AbstractActivityC1500, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0 || iArr[0] == 0) {
            return;
        }
        App app = App.f407;
        Toast.makeText(AbstractC1631.m3410(), AbstractC1631.m3410().getString(R.string.toast_no_permission), 1).show();
        Intent intent = new Intent(new C4441(new long[]{4448393722774832176L, -6000898710540942153L, 1716258629521835929L, 1129405010761126061L, -7217342623883093278L, -820454352187850597L, -6324274631978443081L}).toString());
        Uri uri = Uri.parse(new C4441(new long[]{1046209458814372036L, 6246206809298205383L, 8732756589624633978L, 4366345718050769883L, -7661120662233400748L, 7863753328892582051L}).toString());
        new C4441(new long[]{2182024771042094022L, 1239872114866040863L, -8497866003520677765L}).toString();
        intent.setData(uri);
        startActivity(intent);
    }

    @Override // p000.AbstractActivityC2747, android.app.Activity
    public final void onResume() {
        super.onResume();
        Map map = AbstractC0502.f1819;
        SharedPreferences sharedPreferences = AbstractC0502.f1815;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2197 c2197 = (C2197) this.f415.getValue();
        if (str != null) {
            if (c2197.m4259().contains(str)) {
                c2197.m4260(str);
            } else {
                c2197.m4261(str);
            }
        }
    }
}
