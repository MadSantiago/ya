package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؕؓؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3268 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f10980;

    /* JADX INFO: renamed from: ۥۗ */
    public int f10981 = 1;

    /* JADX INFO: renamed from: ۥۣ */
    public final ComponentName f10982;

    /* JADX INFO: renamed from: ۦؑ */
    public String f10983;

    public C3268(ComponentName componentName) {
        this.f10982 = componentName;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle m6035() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", this.f10982);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", this.f10981);
        bundle.putBoolean("shizuku:user-service-arg-daemon", true);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = this.f10980;
        Objects.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        String str2 = this.f10983;
        if (str2 != null) {
            bundle.putString("shizuku:user-service-arg-tag", str2);
        }
        return bundle;
    }
}
