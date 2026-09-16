package p000;

/* JADX INFO: renamed from: ۦؘٗؗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4383 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14449;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f14450;

    public AbstractC4383(int i, int i2) {
        this.f14450 = i;
        this.f14449 = i2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo7578(InterfaceC3879 interfaceC3879) {
        if (!(interfaceC3879 instanceof C0448)) {
            throw new C1345("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        mo5624(((C0448) interfaceC3879).f1637);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void mo5624(C0956 c0956) {
        throw new C1345("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
