package p000;

/* JADX INFO: renamed from: ۦؚّؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3587 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ DialogC3219 f11936;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3587(DialogC3219 dialogC3219, int i) {
        super(1);
        this.f11937 = i;
        this.f11936 = dialogC3219;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11937;
        DialogC3219 dialogC3219 = this.f11936;
        switch (i) {
            case 0:
                dialogC3219.show();
                return new C4954(0, dialogC3219);
            default:
                dialogC3219.f10805.getClass();
                dialogC3219.f10804.mo449();
                return C2358.f7817;
        }
    }
}
