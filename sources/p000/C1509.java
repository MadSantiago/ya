package p000;

import android.content.Context;
import android.text.method.LinkMovementMethod;

/* JADX INFO: renamed from: ۥٗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1509 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5121;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C3564 f5122;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f5123;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f5124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1509(long j, C3564 c3564, long j2, int i) {
        super(1);
        this.f5124 = j;
        this.f5122 = c3564;
        this.f5123 = j2;
        this.f5121 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Context context = (Context) obj;
        long j = C1327.f4591;
        long jM6359 = this.f5124;
        if (jM6359 == j) {
            jM6359 = this.f5122.m6359();
            if (jM6359 == j) {
                jM6359 = this.f5123;
            }
        }
        C2139 c2139 = new C2139(context, null);
        c2139.setImportantForAccessibility(0);
        c2139.setMaxLines(this.f5121);
        c2139.setLinkTextColor(AbstractC4225.m7470(jM6359));
        c2139.setTextIsSelectable(false);
        c2139.setMovementMethod(LinkMovementMethod.getInstance());
        return c2139;
    }
}
