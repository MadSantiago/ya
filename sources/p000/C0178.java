package p000;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.File;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥؑؒ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0178 implements InterfaceC2740, InterfaceC3558, InterfaceC4573, InterfaceC1268, InterfaceC2429, InterfaceC4070, InterfaceC5346 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f664 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f665;

    /* JADX INFO: renamed from: ۥَ */
    public static /* synthetic */ void m381() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static /* synthetic */ void m382() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ۥْ */
    public static /* synthetic */ void m383(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static /* synthetic */ void m384(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static /* synthetic */ void m385(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ void m386(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* synthetic */ void m387(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ void m388(Object obj, Object obj2, String str) {
        throw new C1228(1, str + obj + obj2);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static /* synthetic */ void m389(C4441 c4441) {
        throw new IllegalStateException(c4441.toString());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static /* synthetic */ void m390(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static /* synthetic */ void m391(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static /* synthetic */ void m392(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* synthetic */ void m393() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static /* synthetic */ void m394(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    @Override // p000.InterfaceC1268
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                C2808 c2808M2865 = C1360.m2865();
                c2808M2865.m5335(cursorRawQuery.getString(1));
                c2808M2865.f9377 = AbstractC3020.m5613(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                c2808M2865.f9378 = string == null ? null : Base64.decode(string, 0);
                arrayList.add(c2808M2865.m5345());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p000.InterfaceC4573
    /* JADX INFO: renamed from: ۥؗ */
    public void mo395(C3267 c3267) {
        ServiceConnectionC2110 serviceConnectionC2110 = C5063.f16800;
        if (c3267.m6030()) {
            App app = App.f407;
            App appM3410 = AbstractC1631.m3410();
            Class<C2460> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(C2460.class));
            AbstractC0282.m593(new Intent(appM3410, clsM9037 != null ? clsM9037 : C2460.class), serviceConnectionC2110);
            return;
        }
        App app2 = App.f407;
        C1443 c1443 = AbstractC2776.m5217().f410;
        C1542 c1542 = AbstractC2539.f8442;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (((String) c1443.m3068(obj, str)).equals(new C4441(new long[]{1579718980344888183L, -4407976409189436693L}).toString()) || ((C5259) serviceConnectionC2110.f6933) != null) {
            return;
        }
        c1443.m3071(new C1797(28));
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ۥّ */
    public Object mo396(C3580 c3580) {
        boolean z;
        if (c3580.m6390()) {
            C3384 c3384 = (C3384) c3580.m6388();
            C1397 c1397 = C1397.f4781;
            c1397.m2965("Crashlytics report successfully enqueued to DataTransport: " + c3384.f11281);
            File file = c3384.f11280;
            if (file.delete()) {
                c1397.m2965("Deleted report file: " + file.getPath());
            } else {
                c1397.m2968("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", c3580.m6387());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
        interfaceC2090.get().getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        switch (this.f665) {
            case 24:
                return TransportRegistrar.lambda$getComponents$0(c2813);
            case 25:
                return TransportRegistrar.lambda$getComponents$1(c2813);
            default:
                return TransportRegistrar.lambda$getComponents$2(c2813);
        }
    }

    public /* synthetic */ C0178(int i) {
        this.f665 = i;
    }

    @Override // p000.InterfaceC4070
    /* JADX INFO: renamed from: ۥۣ */
    public void mo398(Exception exc) {
    }

    @Override // p000.InterfaceC3558
    /* JADX INFO: renamed from: ۦؑ */
    public double mo399(double d) {
        return d;
    }
}
