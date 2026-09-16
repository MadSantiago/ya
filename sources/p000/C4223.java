package p000;

/* JADX INFO: renamed from: ۦٌٕؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4223 extends AbstractC0104 {
    @Override // p000.AbstractC0104
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo192(C0956 c0956) {
        c0956.m1986();
        try {
            c0956.m1982("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c0956.m1983();
        } finally {
            c0956.m1981();
        }
    }
}
