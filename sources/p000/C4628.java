package p000;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ۦٌٜٛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4628 {

    /* JADX INFO: renamed from: ۦِ */
    public static final C4628 f15275 = new C4628();

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f15276;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f15277;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f15278;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3783 f15279;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f15280;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15281;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f15282;

    /* JADX INFO: renamed from: ۦٛ */
    public final Set f15283;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f15284;

    public C4628(C4628 c4628) {
        this.f15276 = c4628.f15276;
        this.f15282 = c4628.f15282;
        this.f15279 = c4628.f15279;
        this.f15281 = c4628.f15281;
        this.f15277 = c4628.f15277;
        this.f15278 = c4628.f15278;
        this.f15283 = c4628.f15283;
        this.f15284 = c4628.f15284;
        this.f15280 = c4628.f15280;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4628.class.equals(obj.getClass())) {
            return false;
        }
        C4628 c4628 = (C4628) obj;
        if (this.f15276 == c4628.f15276 && this.f15282 == c4628.f15282 && this.f15277 == c4628.f15277 && this.f15278 == c4628.f15278 && this.f15284 == c4628.f15284 && this.f15280 == c4628.f15280 && AbstractC3831.m6874(m8012(), c4628.m8012()) && this.f15281 == c4628.f15281) {
            return this.f15283.equals(c4628.f15283);
        }
        return false;
    }

    public final int hashCode() {
        int iM6632 = ((((((((AbstractC3761.m6632(this.f15281) * 31) + (this.f15276 ? 1 : 0)) * 31) + (this.f15282 ? 1 : 0)) * 31) + (this.f15277 ? 1 : 0)) * 31) + (this.f15278 ? 1 : 0)) * 31;
        long j = this.f15284;
        int i = (iM6632 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f15280;
        int iHashCode = (this.f15283.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestM8012 = m8012();
        return iHashCode + (networkRequestM8012 != null ? networkRequestM8012.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + AbstractC5078.m8684(this.f15281) + ", requiresCharging=" + this.f15276 + ", requiresDeviceIdle=" + this.f15282 + ", requiresBatteryNotLow=" + this.f15277 + ", requiresStorageNotLow=" + this.f15278 + ", contentTriggerUpdateDelayMillis=" + this.f15284 + ", contentTriggerMaxDelayMillis=" + this.f15280 + ", contentUriTriggers=" + this.f15283 + ", }";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final NetworkRequest m8012() {
        return (NetworkRequest) this.f15279.f12572;
    }

    public C4628(C3783 c3783, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, LinkedHashSet linkedHashSet) {
        this.f15279 = c3783;
        this.f15281 = i;
        this.f15276 = z;
        this.f15282 = z2;
        this.f15277 = z3;
        this.f15278 = z4;
        this.f15284 = j;
        this.f15280 = j2;
        this.f15283 = linkedHashSet;
    }

    public C4628() {
        this.f15279 = new C3783(null);
        this.f15281 = 1;
        this.f15276 = false;
        this.f15282 = false;
        this.f15277 = false;
        this.f15278 = false;
        this.f15284 = -1L;
        this.f15280 = -1L;
        this.f15283 = C1590.f5346;
    }
}
