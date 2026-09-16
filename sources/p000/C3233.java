package p000;

/* JADX INFO: renamed from: ۦؔؖۛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3233 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3233 f10858 = new C3233();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f10857 = new C2423("kotlin.time.Duration", C2204.f7302);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f10857;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        C4036 c4036 = C5805.f19128;
        String strMo4103 = interfaceC2125.mo4103();
        try {
            long jM7179 = AbstractC4009.m7179(strMo4103);
            if (jM7179 == C5805.f19125) {
                throw new IllegalStateException("invariant failed");
            }
            return new C5805(jM7179);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC3761.m6629("Invalid ISO duration string format: '", strMo4103, "'."), e);
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        long j = ((C5805) obj).f19129;
        C4036 c4036 = C5805.f19128;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM9618 = j < 0 ? C5805.m9618(j) : j;
        long jM9621 = C5805.m9621(jM9618, EnumC3021.HOURS);
        boolean z = false;
        int iM9621 = C5805.m9615(jM9618) ? 0 : (int) (C5805.m9621(jM9618, EnumC3021.MINUTES) % 60);
        int iM9622 = C5805.m9615(jM9618) ? 0 : (int) (C5805.m9621(jM9618, EnumC3021.SECONDS) % 60);
        int iM9620 = C5805.m9620(jM9618);
        if (C5805.m9615(j)) {
            jM9621 = 9999999999999L;
        }
        boolean z2 = jM9621 != 0;
        boolean z3 = (iM9622 == 0 && iM9620 == 0) ? false : true;
        if (iM9621 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM9621);
            sb.append('H');
        }
        if (z) {
            sb.append(iM9621);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C5805.m9617(sb, iM9622, iM9620, 9, "S", true);
        }
        c3782.m6686(sb.toString());
    }
}
