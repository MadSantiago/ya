package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: ۦٓؓؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4114 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final C2600 f13717;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4995 f13718;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13719;

    public /* synthetic */ RunnableC4114(C4995 c4995, C2600 c2600, int i) {
        this.f13719 = i;
        this.f13718 = c4995;
        this.f13717 = c2600;
    }

    @Override // java.lang.Runnable
    public final void run() throws C0768 {
        int i = this.f13719;
        C2600 c2600 = this.f13717;
        C4995 c4995 = this.f13718;
        switch (i) {
            case 0:
                if (c4995.isCancelled()) {
                    c2600.mo3713(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = c4995.f16533.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            c2600.mo335(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        c2600.mo335(new C4535(e.getCause()));
                        return;
                    }
                }
                break;
            default:
                if (c4995.isCancelled()) {
                    c2600.mo3713(null);
                    return;
                }
                try {
                    c2600.mo335(AbstractC0065.m6599(c4995));
                    return;
                } catch (ExecutionException e2) {
                    c2600.mo335(new C4535(e2.getCause()));
                    return;
                }
        }
    }
}
