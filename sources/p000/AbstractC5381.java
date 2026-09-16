package p000;

/* JADX INFO: renamed from: ۦٖ۠ؒٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5381 implements InterfaceC3975 {

    /* JADX INFO: renamed from: ۥؓ */
    public C5304 f17778;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f17779;

    /* JADX INFO: renamed from: ۥَ */
    public AbstractC5381 f17780;

    /* JADX INFO: renamed from: ۥْ */
    public int f17781;

    /* JADX INFO: renamed from: ۥٖ */
    public AbstractC5381 f17783;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f17784;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f17785;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f17786;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f17787;

    /* JADX INFO: renamed from: ۦٗ */
    public C4178 f17788;

    /* JADX INFO: renamed from: ۦۛ */
    public AbstractC1311 f17789;

    /* JADX INFO: renamed from: ۦ۟ */
    public C3950 f17790;

    /* JADX INFO: renamed from: ۦۨ */
    public AbstractC5381 f17791 = this;

    /* JADX INFO: renamed from: ۥٓ */
    public int f17782 = -1;

    /* JADX INFO: renamed from: ۥؘ */
    public void mo5605() {
        if (!this.f17786) {
            AbstractC3480.m6278("reset() called on an unattached node");
        }
        mo1267();
    }

    /* JADX INFO: renamed from: ۥٔ */
    public void mo5606() {
        if (!this.f17786) {
            AbstractC3480.m6278("node detached multiple times");
        }
        if (this.f17789 == null) {
            AbstractC3480.m6278("detach invoked on a node without a coordinator");
        }
        if (!this.f17779) {
            AbstractC3480.m6278("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f17779 = false;
        C5304 c5304 = this.f17778;
        if (c5304 != null) {
            c5304.mo449();
        }
        mo788();
    }

    /* JADX INFO: renamed from: ۥۛ */
    public final InterfaceC4643 m9076() {
        C3950 c3950 = this.f17790;
        if (c3950 != null) {
            return c3950;
        }
        C3950 c3950M7151 = AbstractC4009.m7151(((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getCoroutineContext().mo860(new C3841((InterfaceC3196) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getCoroutineContext().mo865(C1397.f4791))));
        this.f17790 = c3950M7151;
        return c3950M7151;
    }

    /* JADX INFO: renamed from: ۦؘ */
    public boolean mo786() {
        return !(this instanceof C4476);
    }

    /* JADX INFO: renamed from: ۦٍ */
    public void mo5608() {
        if (this.f17786) {
            AbstractC3480.m6278("node attached multiple times");
        }
        if (this.f17789 == null) {
            AbstractC3480.m6278("attach invoked on a node without a coordinator");
        }
        this.f17786 = true;
        this.f17784 = true;
    }

    /* JADX INFO: renamed from: ۦْ */
    public void mo5609() {
        if (!this.f17786) {
            AbstractC3480.m6278("Cannot detach a node that is not attached");
        }
        if (this.f17784) {
            AbstractC3480.m6278("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f17779) {
            AbstractC3480.m6278("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f17786 = false;
        C3950 c3950 = this.f17790;
        if (c3950 != null) {
            AbstractC4009.m7180(c3950, new C4511(2, "The Modifier.Node was detached"));
            this.f17790 = null;
        }
    }

    /* JADX INFO: renamed from: ۦٙ */
    public void mo5610(AbstractC1311 abstractC1311) {
        this.f17789 = abstractC1311;
    }

    /* JADX INFO: renamed from: ۦٜ */
    public void mo5611() {
        if (!this.f17786) {
            AbstractC3480.m6278("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f17784) {
            AbstractC3480.m6278("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f17784 = false;
        mo780();
        this.f17779 = true;
    }

    /* JADX INFO: renamed from: ۦۡ */
    public void mo5612(AbstractC5381 abstractC5381) {
        this.f17791 = abstractC5381;
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo780() {
    }

    /* JADX INFO: renamed from: ۦً */
    public void mo1267() {
    }

    /* JADX INFO: renamed from: ۦٓ */
    public void mo788() {
    }
}
