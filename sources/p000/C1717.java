package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ۥُٖٚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1717 extends Exception {

    /* JADX INFO: renamed from: ۦۨ */
    public final Status f5720;

    public C1717(Status status) {
        int i = status.f301;
        String str = status.f300;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f5720 = status;
    }
}
