package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥًؑؖٙ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0206 extends AbstractC0772 {

    /* JADX INFO: renamed from: ۥَ */
    public int f752;

    /* JADX INFO: renamed from: ۥٓ */
    public /* synthetic */ Object f753;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C1736 f754;

    /* JADX INFO: renamed from: ۥۖ */
    public int f755;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC4161 f756;

    /* JADX INFO: renamed from: ۦۛ */
    public Serializable f757;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206(C1736 c1736, InterfaceC0443 interfaceC0443) {
        super(interfaceC0443);
        this.f754 = c1736;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        this.f753 = obj;
        this.f752 |= Integer.MIN_VALUE;
        return this.f754.mo1575(null, this);
    }
}
