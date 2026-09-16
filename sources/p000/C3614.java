package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۦَؚٜؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3614 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f12044;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ WorkDatabase f12045;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC4745 f12046;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ boolean f12047;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f12048;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3614(InterfaceC0443 interfaceC0443, InterfaceC4745 interfaceC4745, WorkDatabase workDatabase, boolean z, boolean z2) {
        super(2, interfaceC0443);
        this.f12045 = workDatabase;
        this.f12047 = z;
        this.f12048 = z2;
        this.f12046 = interfaceC4745;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C3614(interfaceC0443, this.f12046, this.f12045, this.f12047, this.f12048);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f12044;
        if (i != 0) {
            if (i == 1) {
                AbstractC0186.m409(obj);
                return obj;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        InterfaceC4745 interfaceC4745 = this.f12046;
        WorkDatabase workDatabase = this.f12045;
        boolean z = this.f12048;
        boolean z2 = this.f12047;
        C4978 c4978 = new C4978(null, interfaceC4745, workDatabase, z, z2);
        this.f12044 = 1;
        Object objM84 = workDatabase.m84(z2, c4978, this);
        EnumC2282 enumC2282 = EnumC2282.f7590;
        return objM84 == enumC2282 ? enumC2282 : objM84;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C3614) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
