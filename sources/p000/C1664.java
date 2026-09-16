package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: ۥؘْٙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 extends AbstractC3092 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f5545;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2332 f5546;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f5547;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1664(C0488 c0488, C2332 c2332) {
        this(4, c2332);
        this.f5545 = 1;
        this.f5547 = c0488;
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3475(Status status) {
        this.f5546.m4375(new C1717(status));
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3476(C3184 c3184) throws DeadObjectException {
        try {
            m3479(c3184);
        } catch (DeadObjectException e) {
            mo3475(AbstractC3092.m5679(e));
            throw e;
        } catch (RemoteException e2) {
            mo3475(AbstractC3092.m5679(e2));
        } catch (RuntimeException e3) {
            this.f5546.m4375(e3);
        }
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥّ */
    public final /* bridge */ /* synthetic */ void mo3477(C2346 c2346, boolean z) {
        int i = this.f5545;
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥۗ */
    public final C2274[] mo3478(C3184 c3184) {
        int i = this.f5545;
        Object obj = this.f5547;
        switch (i) {
            case 0:
                return (C2274[]) ((C5742) obj).f18939.f4835;
            default:
                C5742 c5742 = (C5742) c3184.f10696.get((C0488) obj);
                if (c5742 == null) {
                    return null;
                }
                return (C2274[]) c5742.f18939.f4835;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m3479(C3184 c3184) {
        switch (this.f5545) {
            case 0:
                C1405 c1405 = ((C5742) this.f5547).f18939;
                ((C5460) ((C4752) c1405.f4838).f15686).accept(c3184.f10702, this.f5546);
                C0488 c0488 = (C0488) ((C1795) ((C5742) this.f5547).f18939.f4836).f5992;
                if (c0488 != null) {
                    c3184.f10696.put(c0488, (C5742) this.f5547);
                }
                break;
            default:
                C5742 c5742 = (C5742) c3184.f10696.remove((C0488) this.f5547);
                if (c5742 == null) {
                    this.f5546.m4374(Boolean.FALSE);
                } else {
                    ((C5518) ((C4752) c5742.f18938.f3672).f15684).accept(c3184.f10702, this.f5546);
                    C1795 c1795 = (C1795) c5742.f18939.f4836;
                    c1795.f5993 = null;
                    c1795.f5992 = null;
                }
                break;
        }
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo3480(C3184 c3184) {
        int i = this.f5545;
        Object obj = this.f5547;
        switch (i) {
            case 0:
                return ((C5742) obj).f18939.f4837;
            default:
                C5742 c5742 = (C5742) c3184.f10696.get((C0488) obj);
                return c5742 != null && c5742.f18939.f4837;
        }
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3481(Exception exc) {
        this.f5546.m4375(exc);
    }

    public C1664(int i, C2332 c2332) {
        super(i);
        this.f5546 = c2332;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1664(C5742 c5742, C2332 c2332) {
        this(3, c2332);
        this.f5545 = 0;
        this.f5547 = c5742;
    }

    /* JADX INFO: renamed from: ۦِ */
    private final /* bridge */ /* synthetic */ void m3473(C2346 c2346, boolean z) {
    }

    /* JADX INFO: renamed from: ۦٛ */
    private final /* bridge */ /* synthetic */ void m3474(C2346 c2346, boolean z) {
    }
}
