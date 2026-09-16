package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۥٜۨؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2936 implements InterfaceC4886 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f9866;

    /* JADX INFO: renamed from: ۥۗ */
    public String f9867;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f9868 = 0;

    public C2936(C5002 c5002) {
        Context context = (Context) c5002.f16551;
        int iM4152 = AbstractC2133.m4152(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iM4152 != 0) {
            this.f9867 = "Unity";
            String string = context.getResources().getString(iM4152);
            this.f9866 = string;
            String strM6628 = AbstractC3761.m6628("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM6628, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f9867 = "Flutter";
                this.f9866 = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f9867 = null;
        this.f9866 = null;
    }

    @Override // p000.InterfaceC4886
    public C3416 toInstant() {
        throw new C0869(this.f9867 + " when parsing an Instant from \"" + AbstractC3801.m6752(64, this.f9866) + '\"');
    }

    public String toString() {
        switch (this.f9868) {
            case 0:
                StringBuilder sb = new StringBuilder("CssProperty{key='");
                sb.append(this.f9867);
                sb.append("', value='");
                return AbstractC3761.m6621(sb, this.f9866, "'}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2936() {
    }

    public C2936(String str, String str2) {
        this.f9867 = str;
        this.f9866 = str2;
    }
}
