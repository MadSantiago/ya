package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥّْؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1138 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f3979;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f3980;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f3981 = true;

    /* JADX INFO: renamed from: ۦؑ */
    public Serializable f3982;

    /* JADX INFO: renamed from: ۥؗ */
    public void m2394(String... strArr) {
        if (!this.f3981) {
            C1078.m2272("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f3979 = (String[]) strArr.clone();
        } else {
            C1078.m2272("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: ۥُ */
    public void m2395(String... strArr) {
        if (!this.f3981) {
            C1078.m2272("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f3982 = (String[]) strArr.clone();
        } else {
            C1078.m2272("At least one TLS version is required");
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m2396(C5700... c5700Arr) {
        if (!this.f3981) {
            C1078.m2272("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c5700Arr.length);
        for (C5700 c5700 : c5700Arr) {
            arrayList.add(c5700.f18773);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m2394((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C5055 m2397() {
        return new C5055(this.f3981, this.f3980, (String[]) this.f3979, (String[]) this.f3982);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m2398(EnumC2044... enumC2044Arr) {
        if (!this.f3981) {
            C1078.m2272("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(enumC2044Arr.length);
        for (EnumC2044 enumC2044 : enumC2044Arr) {
            arrayList.add(enumC2044.f6743);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m2395((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
