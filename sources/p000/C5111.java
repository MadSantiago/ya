package p000;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: ۦٕۙؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5111 extends AbstractC5865 {
    /* JADX INFO: renamed from: ۥٖ */
    public static final boolean m8738(String str) {
        String str2 = (String) AbstractC4936.f16278.m4592(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m8739(String str) {
        C3040 c3040 = this.f19371.f16698;
        C5034.m8484(c3040);
        String strM5642 = c3040.m5642(str);
        if (TextUtils.isEmpty(strM5642)) {
            return (String) AbstractC4936.f16275.m4592(null);
        }
        Uri uri = Uri.parse((String) AbstractC4936.f16275.m4592(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strM5642).length() + 1 + String.valueOf(authority).length());
        sb.append(strM5642);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.m5998().m7327()) goto L28;
     */
    /* JADX INFO: renamed from: ۥٓ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C1379 m8740(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5111.m8740(java.lang.String):ۥٕٜؑٗ");
    }
}
