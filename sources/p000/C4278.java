package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* JADX INFO: renamed from: ۦُٖؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4278 extends AbstractC4383 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f14161;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f14162;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4278(int i) {
        super(14, 15);
        this.f14161 = i;
        switch (i) {
            case 1:
                super(19, 20);
                this.f14162 = new C1397(28);
                break;
            default:
                this.f14162 = new C1298(28);
                break;
        }
    }

    @Override // p000.AbstractC4383
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo7578(InterfaceC3879 interfaceC3879) {
        switch (this.f14161) {
            case 0:
                C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                C4773.m8153(interfaceC3879, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                C4773.m8153(interfaceC3879, "DROP TABLE `WorkSpec`");
                C4773.m8153(interfaceC3879, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (interfaceC3879 instanceof C0448) {
                    C0956 c0956 = ((C0448) interfaceC3879).f1637;
                    c0956.m1982("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                    int i = 0;
                    Object[] objArr = new Object[0];
                    if (contentValues.size() == 0) {
                        C1078.m2272("Empty values");
                        return;
                    }
                    int size = contentValues.size();
                    int length = objArr.length + size;
                    Object[] objArr2 = new Object[length];
                    StringBuilder sb = new StringBuilder("UPDATE ");
                    sb.append(C0956.f3393[3]);
                    sb.append("WorkSpec SET ");
                    int i2 = 0;
                    for (String str : contentValues.keySet()) {
                        sb.append(i2 > 0 ? "," : "");
                        sb.append(str);
                        objArr2[i2] = contentValues.get(str);
                        sb.append("=?");
                        i2++;
                    }
                    for (int i3 = size; i3 < length; i3++) {
                        objArr2[i3] = objArr[i3 - size];
                    }
                    if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
                    C4819 c4819M1988 = c0956.m1988(sb.toString());
                    while (i < length) {
                        Object obj = objArr2[i];
                        i++;
                        if (obj == null) {
                            c4819M1988.mo1231(i);
                        } else if (obj instanceof byte[]) {
                            c4819M1988.mo1234(i, (byte[]) obj);
                        } else if (obj instanceof Float) {
                            c4819M1988.mo1235(((Number) obj).floatValue(), i);
                        } else if (obj instanceof Double) {
                            c4819M1988.mo1235(((Number) obj).doubleValue(), i);
                        } else if (obj instanceof Long) {
                            c4819M1988.mo1232(((Number) obj).longValue(), i);
                        } else if (obj instanceof Integer) {
                            c4819M1988.mo1232(((Number) obj).intValue(), i);
                        } else if (obj instanceof Short) {
                            c4819M1988.mo1232(((Number) obj).shortValue(), i);
                        } else if (obj instanceof Byte) {
                            c4819M1988.mo1232(((Number) obj).byteValue(), i);
                        } else if (obj instanceof String) {
                            c4819M1988.mo1233(i, (String) obj);
                        } else {
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            c4819M1988.mo1232(((Boolean) obj).booleanValue() ? 1L : 0L, i);
                        }
                    }
                    c4819M1988.f15880.executeUpdateDelete();
                    return;
                }
                return;
            default:
                C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                C4773.m8153(interfaceC3879, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                C4773.m8153(interfaceC3879, "DROP TABLE `WorkSpec`");
                C4773.m8153(interfaceC3879, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                C4773.m8153(interfaceC3879, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                if (interfaceC3879 instanceof C0448) {
                    ((C0448) interfaceC3879).f1637.m1982("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                    return;
                }
                return;
        }
    }
}
