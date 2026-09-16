package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦّۢؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5563 implements InterfaceC2150 {

    /* JADX INFO: renamed from: ۦۨ */
    public final Double f18369;

    public C5563(Double d) {
        if (d == null) {
            this.f18369 = Double.valueOf(Double.NaN);
        } else {
            this.f18369 = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5563) {
            return this.f18369.equals(((C5563) obj).f18369);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18369.hashCode();
    }

    public final String toString() {
        return mo1607();
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥُ */
    public final Iterator mo1606() {
        return null;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1607() {
        Double d = this.f18369;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C2485(mo1607());
        }
        throw new IllegalArgumentException(mo1607() + "." + str + " is not a function.");
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean mo1609() {
        Double d = this.f18369;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦٛ */
    public final Double mo1610() {
        return this.f18369;
    }

    @Override // p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return new C5563(this.f18369);
    }
}
