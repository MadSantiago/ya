package p000;

/* JADX INFO: renamed from: ۦؗؕٞٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3428 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5662 f11392;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11393 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3428(C5086 c5086, C3920 c3920, C5662 c5662) {
        super(1);
        this.f11392 = c5662;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11393;
        EnumC1848 enumC1848 = EnumC1848.f6133;
        C5662 c5662 = this.f11392;
        switch (i) {
            case 0:
                C3920 c3920 = (C3920) obj;
                if (!c3920.f17786) {
                    return EnumC1848.f6132;
                }
                if (c3920.f13068 != null) {
                    AbstractC3480.m6278("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                c3920.f13068 = null;
                c5662.f18631 = c5662.f18631;
                return enumC1848;
            default:
                if (!((AbstractC1849) obj).f6135) {
                    return enumC1848;
                }
                c5662.f18631 = false;
                return EnumC1848.f6130;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3428(C5662 c5662) {
        super(1);
        this.f11392 = c5662;
    }
}
