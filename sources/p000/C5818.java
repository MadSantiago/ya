package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: ۦۧؔؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5818 extends C4571 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Field f19155;

    /* JADX INFO: renamed from: ۥۗ */
    public final Member f19156;

    public C5818(Member member) {
        super(member);
        this.f19156 = member;
        this.f19155 = (Field) member;
    }

    @Override // p000.C4571
    public final String toString() {
        return this.f19156.toString();
    }

    @Override // p000.C4571
    /* JADX INFO: renamed from: ۥۗ */
    public final Member mo3892() {
        return this.f19156;
    }
}
