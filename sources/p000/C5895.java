package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦؘۨؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5895 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f19443;

    public C5895(Context context) {
        this.f19443 = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5895) {
            return this.f19443.equals(((C5895) obj).f19443);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19443.hashCode();
    }
}
